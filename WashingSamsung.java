class WashingSamsung{
   static int minTime;
   static int maxTime;
   static int currentTime;
  static boolean isConnected ;

  public static boolean onOrOff() {
    System.out.println("invoking onOrOff()");


    if(isConnected==false){
        isConnected=true;
        System.out.println("washing samsung turned on ");

    }else{
        isConnected=false;
        System.out.println("washing samsung is turned off");
    }
    return isConnected;
  }


  public static void increaseTime(){

    if(isConnected=true){

        if(currentTime<maxTime){
                currentTime++;
        }else{
            System.out.println("washing samsung at already maximum" +currentTime);
        }
    }else{
               System.out.println("connect to the washing samsung");
    }
  }

  public static void decreaseTime(){

    if(isConnected=true){
        
        if(currentTime>minTime){
            currentTime--;
            System.out.println("current time is decreased " +currentTime);

        }else{
            System.out.println("minimum time is reached ");

        }
    }else{
         System.out.println("first connect to the washing samsung");
    }
  }
}