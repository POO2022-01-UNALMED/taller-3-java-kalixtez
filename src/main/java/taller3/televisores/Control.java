package taller3.televisores;

public class Control
{
	TV tv;
	
	void turnOn()
	{
		this.tv.turnOn();
	}
	
	void turnOff()
	{
		this.tv.turnOff();
	}
	
	void volumenUp()
	{

		this.tv.volumenUp();
	}
	
	void volumenDown()
	{

		this.tv.volumenDown();
	}
	
	void canalUp()
	{

		this.tv.canalUp();
	}
	
	void canalDown()
	{

		this.tv.canalDown();
	}
	
	void setCanal(int n_can) 
	{
		this.tv.setCanal(n_can);
	}
	
	void enlazar(TV tv)
	{
		
		tv.setControl(this);
		this.tv = tv;
	}
	
	TV getTv() 
	{
		return this.tv;
	}
	
	void setTv(TV tv)
	{
		this.tv = tv;
	}
}
