class amstrong{
public static void main(String arg[])
{
int temp, digits=0, last=0, sum=0;  
int n=370;
temp=n;
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   


temp = n;   
while(temp>0)   
{   
	last = temp % 10;   
	sum +=  (Math.pow(last, digits));   
  	temp = temp/10;   
}  
if(n==sum)   
{
System.out.print("Armstrong ");  
}  
else   
{  
System.out.print("Not Armstrong ");  
}  
}
}