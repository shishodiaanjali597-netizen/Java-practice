// write a programm to print "GOOD MORNING" and "WELCOME" continuosly using thread in java 
 /*class goodmorningthread extends Thread{
    public void run(){
        while(true){
            System.out.println("GOODMORNING");
        }
   
    }

 } 
 class welcomethread extends Thread{
    public void run(){
        while(true){
            System.out.println("WELCOME");
        }
    }
 }
 class threadingconcecpt{
    public static void main(String[]args){
        goodmorningthread gm=new goodmorningthread();
        welcomethread wc=new welcomethread();
        gm.start();
        wc.start();

    }

 }*/

    // add a sleep method in welcomethread to delay its execution 
    /*class goodmorningthread extends Thread{
    public void run(){
        while(true){
            System.out.println("GOODMORNING");
        }
   
    }

 } 
 class welcomethread extends Thread{
    public void run(){
        while(true){
            System.out.println("WELCOME");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
 }
 class threadingconcecpt{
    public static void main(String[]args){
        goodmorningthread gm=new goodmorningthread();
        welcomethread wc=new welcomethread();
        gm.start();
        wc.start();

    }

 }*/

    //demonstrate getpriority() and setpriority() method in java thread
    /*class goodmorningthread extends Thread{
    public void run(){
        while(true){
            System.out.println("GOODMORNING");
        }
   
    }}
    class welcomethread extends Thread{
    public void run(){
        while(true){
            System.out.println("WELCOME");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }}
    class threadingconcecpt{
    public static void main(String[]args){
        goodmorningthread gm=new goodmorningthread();
        welcomethread wc=new welcomethread();
        gm.setPriority(Thread.MIN_PRIORITY);
        wc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("GOODMORNING THREAD PRIORITY:"+gm.getPriority());
        System.out.println("WELCOME THREAD PRIORITY:"+wc.getPriority());
        gm.start();
        wc.start();

    }}*/
   // how do you get reference of current thread in java
   /*class goodmorningthread extends Thread{
    public void run(){
       
            System.out.println("GOODMORNING");
        }
   
    }
    class welcomethread extends Thread{
    public void run(){
   
            System.out.println("WELCOME");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    class threadingconcecpt{
    public static void main(String[]args){
        goodmorningthread gm=new goodmorningthread();
        welcomethread wc=new welcomethread();
        gm.setPriority(Thread.MIN_PRIORITY);
        wc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("GOODMORNING THREAD PRIORITY:"+gm.getPriority());
        System.out.println("WELCOME THREAD PRIORITY:"+wc.getPriority());
        gm.start();
        wc.start();
        Thread t=Thread.currentThread();
        System.out.println("CURRENT THREAD:"+t);
    }}*/
   
   
        // how to get state of  given thread in java 
        /*class goodmorningthread extends Thread{
    public void run(){
       
            System.out.println("GOODMORNING");
        }
   
    }
    class welcomethread extends Thread{
    public void run(){
   
            System.out.println("WELCOME");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    class threadingconcecpt{
    public static void main(String[]args){
        goodmorningthread gm=new goodmorningthread();
        welcomethread wc=new welcomethread();
        gm.setPriority(Thread.MIN_PRIORITY);
        wc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("GOODMORNING THREAD PRIORITY:"+gm.getPriority());
        System.out.println("WELCOME THREAD PRIORITY:"+wc.getPriority());
        System.out.println("GM state before start" + gm.getState());
        gm.start();
        wc.start();
        System.out.println("GM state after start" + gm.getState());
        
    }}*/
