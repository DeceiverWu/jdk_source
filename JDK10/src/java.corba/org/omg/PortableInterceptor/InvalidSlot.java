package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/InvalidSlot.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/open/src/java.corba/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, March 7, 2018 at 6:07:53 PM Pacific Standard Time
*/

public final class InvalidSlot extends org.omg.CORBA.UserException
{

  public InvalidSlot ()
  {
    super(InvalidSlotHelper.id());
  } // ctor


  public InvalidSlot (String $reason)
  {
    super(InvalidSlotHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidSlot
