package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/CannotProceed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/open/src/java.corba/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, March 7, 2018 at 6:07:50 PM Pacific Standard Time
*/

public final class CannotProceed extends org.omg.CORBA.UserException
{
  public org.omg.CosNaming.NamingContext cxt = null;
  public org.omg.CosNaming.NameComponent rest_of_name[] = null;

  public CannotProceed ()
  {
    super(CannotProceedHelper.id());
  } // ctor

  public CannotProceed (org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id());
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor


  public CannotProceed (String $reason, org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id() + "  " + $reason);
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor

} // class CannotProceed
