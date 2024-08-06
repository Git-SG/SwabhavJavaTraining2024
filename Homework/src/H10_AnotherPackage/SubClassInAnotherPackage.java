package H10_AnotherPackage;

import H10_Inheritance_model.SuperClass;

public class SubClassInAnotherPackage extends SuperClass{
	
	private Integer publicB = SuperClass.b;
	private Integer protectedC = SuperClass.c;
	private Integer defaultD = SuperClass.d;

}
