//Clasa Gaming Session


import java.util.Vector;

public class GamingSession {

  private static GamingSession instance=new GamingSession();

  private GamingSession(){

  }

  public static GamingSession getInstance() {
        return instance;
  }

  protected static void demoMethod(){
      System.out.println("demo for singleton");
  }

}

