package taller3.televisores;

public class Control
{
	TV tv;
	
	public void turnOn()
	{
		this.tv.turnOn();
	}
	
	public void turnOff()
	{
		this.tv.turnOff();
	}
	
	public void volumenUp()
	{

		this.tv.volumenUp();
	}
	
	public void volumenDown()
	{

		this.tv.volumenDown();
	}
	
	public void canalUp()
	{

		this.tv.canalUp();
	}
	
	public void canalDown()
	{

		this.tv.canalDown();
	}
	
	public void setCanal(int n_can) 
	{
		this.tv.setCanal(n_can);
	}
	
	public void enlazar(TV tv)
	{
		
		tv.setControl(this);
		this.tv = tv;
	}
	
	public TV getTv() 
	{
		return this.tv;
	}
	
	public void setTv(TV tv)
	{
		this.tv = tv;
	}
}
