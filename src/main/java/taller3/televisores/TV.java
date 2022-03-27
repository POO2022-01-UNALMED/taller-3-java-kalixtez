package taller3.televisores;

public class TV 
{
	Marca marca;
	
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	
	private static int numTV = 0;
	
	private Control control;
	
	TV(Marca n_marca, boolean n_estado)
	{
		this.marca = n_marca;
		this.estado = n_estado;
		
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	void setCanal(int n_canal)
	{
		if(this.estado)
		{
			if(n_canal <= 120 && n_canal > 0)
				this.canal = n_canal;
		}
	}
	
	void setControl(Control n_control)
	{
		this.control = n_control;
	}
	
	void setPrecio(int n_precio)
	{
		this.precio = n_precio;
	}
	
	void setMarca(Marca n_marca)
	{
		this.marca = n_marca;
	}
	
	void setVolumen(int n_vol)
	{

		if(this.estado)
		{
			if(n_vol <= 7 && n_vol >= 0)
				this.volumen = n_vol;
		}
	}
	
	int getCanal() 
	{
		return this.canal;
	}
	
	int getVolumen()
	{
		return this.volumen;
	}
	
	int getPrecio()
	{
		return this.precio;
	}
	
	Control getControl()
	{
		return this.control;
	}
	
	Marca getMarca()
	{
		return this.marca;
	}
	
	int getNumTV()
	{
		return numTV;
	}
	
	void turnOn()
	{
		this.estado = true;
	}
	
	void turnOff()
	{
		this.estado = false;
	}
	
	void volumenUp()
	{

		if(this.estado)
		{
			if(this.volumen < 7)
				this.volumen++;
		}
	}
	
	void volumenDown()
	{

		if(this.estado)
		{
			if(this.volumen > 0)
				this.volumen--;
		}
	}
	
	void canalUp()
	{

		if(this.estado)
		{
			if(this.canal < 120)
				this.canal++;
		}
	}
	
	void canalDown()
	{

		if(this.estado)
		{
			if(this.canal > 1)
				this.canal--;
		}
	}
	
	boolean getEstado()
	{
		return this.estado;
	}
}
