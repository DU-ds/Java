


public class Kitchen {

    public boolean  lightOn;
    public boolean  ovenOn;    // fields of class Kitchen
    public short    ovenTemp;
  /*  public boolean  sinkOn;
    public byte     sinkTemp;
    public boolean  stoveOn;
    public short    stoveTemp;
    public boolean  fridgeOpen;
    public byte     fridgeTemp; */
    // make a cabinet and put food in it?


    public Kitchen(boolean lightInitial, boolean ovenInitial, short ovenTempInitial) { 
    // constructor of class Kitchen
      
//uncomment when I know how to make more classes? IDK
        /*, boolean sinkInitial, 
    byte sinkTempInitial, boolean stoveOnInitial, short stoveTempInitial, boolean fridgeOpenInitial,
    byte fridgeTempInitial*/
        lightOn    =  lightInitial     ;
        ovenOn    =  ovenInitial       ;   
        ovenTemp   =  ovenTempInitial  ;
        /*  sinkOn     =  sinkInitial      ;
          sinkTemp   =  sinkTempInitial  ;
          stoveOn    =  stoveOnInitial   ;
          stoveTemp  =  stoveTempInitial ;
          fridgeOpen =  fridgeOpenInitial; 
          fridgeTemp =  fridgeTempInitial; */
    }

    public Kitchen (){
        lightOn = false;
        ovenOn = false;
        ovenTemp = 70;
    }

    public Kitchen(  short ovenTemp) {
        lightOn = true; // light must be on to cook
        ovenOn = true;  // oven must be on to use it
        this.ovenTemp = ovenTemp;  // this keyword
    }


    //methods for class kitchen


    public void flipLightSwitch(){
        lightOn = !(lightOn);
    }

    public void turnOvenOnOff(){
        ovenOn = ! (ovenOn);
    }

/*    public void increaseOvenTemp(short increase){
        if (ovenOn){
        ovenTemp += increase;
        }
        else{
            ovenOn = true;
            ovenTemp += increase;
        }
    } */
    // instead I could leave out the conditional and just turn it on automatically 

    public void increaseOvenTemp(short increase){
        ovenOn = true
        ovenTemp += increase;
        
    }

    public void decreaseOvenTemp(short decrease){
        ovenTemp -= decrease;
    }

    public void setOverTemp( short ovenTemp ){
        ovenOn = true;
        this.ovenTemp = ovenTemp;
    }

    

}
