package cl.pillan.core;

import java.io.Serializable;
import java.math.BigDecimal;

public class InputMessage implements Serializable 
{

    public static final long serialVersionUID = 1L; //[002]
    public BigDecimal myCodAnaTsk = null; //[005]
    public long myCodStt = 0; //[005]
    public String myPosX = null; //[005]
    public String myPosY = null; //[005]
    public String myPosZ = null; //[005]
    public String myIndP = null; //[005]
    public String myIndI = null; //[005]
    public String myIndA = null; //[005]
    public String myUserName = null; //[005]
    public String myDomain = null; //[005]
    public String myChannel = null; //[005]
    public String myGls = null; //[005]
    public String myLnk = null; //[005]
    public String myTransactTime = null; //[005]
    public String myEntryTime = null; //[005]
    
}
