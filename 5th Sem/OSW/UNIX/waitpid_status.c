/* Program to demonstrate wait and exit*/

#include<stdio.h> 
#include<stdlib.h> 
#include<sys/wait.h> 
#include<unistd.h> 
  
int main() 
{ 
    pid_t cpid; 
    pid_t cpid2;
    int status = 0;
    cpid = fork();
    if(cpid == -1)
        exit(-1);           /* terminate child */

    if(cpid == 0){
        printf("\nfirst child executing  its pid = (%d)\n",getpid());
        sleep(20);
        printf("Child pid = %d\n", getpid()); 
        exit(1);
    } 
    else{    
    cpid2 = fork();
    if(cpid2 == 0){
        printf("\nsecond child executing  its pid = (%d)\n",getpid());
        sleep(20);
        printf("Child pid = %d\n", getpid()); 
        exit(1);
    }
        printf("\n Parent executing before wait()\n");
        while(1)
        {
        pid_t id2 = waitpid(cpid, &status, WNOHANG|WUNTRACED|WCONTINUED); 
	printf("status == %d\n",status);
	sleep(1);
	if(id2==-1)
	{break;}
        if(id2>0){
        //cpid = wait(&status); 
        if(WIFEXITED(status)){
        printf("The exit status set %d \n", WEXITSTATUS(status));
       
        }
        else if (WIFSIGNALED(status)){
        printf("The termination signal is %d \n", WTERMSIG(status));
        }
        else if (WIFSTOPPED(status)){
        printf("The stopped signal is : %d \n",WSTOPSIG(status));
        
        }
        else if (WIFCONTINUED(status))
        printf("The prosess is resume\n");
        
        }
    }
    }
    printf("The parent process completed .......\n");
  
    return 0; 
} 


#if 0
Process termination status (int) 16 bit number
1. status value if  child process has normal exit/termination
   15......8    |     7......0
   XXXXXXXX     |     XXXXXXXX 
   exitStaus    |     0


2. killed by signal
    15......8    |     7   ......0
    unused       |     X   termination signal
                       |
                       |-----> core dump flag


#endif
