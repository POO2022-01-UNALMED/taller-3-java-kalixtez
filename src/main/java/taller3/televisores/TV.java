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
	
	public TV(Marca n_marca, boolean n_estado)
	{
		this.marca = n_marca;
		this.estado = n_estado;
		
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public void setCanal(int n_canal)
	{
		if(this.estado)
		{
			if(n_canal <= 120 && n_canal > 0)
				this.canal = n_canal;
		}
	}
	
	public void setControl(Control n_control)
	{
		this.control = n_control;
	}
	
	public void setPrecio(int n_precio)
	{
		this.precio = n_precio;
	}
	
	public void setMarca(Marca n_marca)
	{
		this.marca = n_marca;
	}
	
	public void setVolumen(int n_vol)
	{

		if(this.estado)
		{
			if(n_vol <= 7 && n_vol >= 0)
				this.volumen = n_vol;
		}
	}
	
	public int getCanal() 
	{
		return this.canal;
	}
	
	public int getVolumen()
	{
		return this.volumen;
	}
	
	public int getPrecio()
	{
		return this.precio;
	}
	
	public Control getControl()
	{
		return this.control;
	}
	
	public Marca getMarca()
	{
		return this.marca;
	}
	
	public static int getNumTV()
	{
		return numTV;
	}
	
	public static void setNumTV(int ntv)
	{
		numTV = ntv;
	}
	
	public void turnOn()
	{
		this.estado = true;
	}
	
	public void turnOff()
	{
		this.estado = false;
	}
	
	public void volumenUp()
	{

		if(this.estado)
		{
			if(this.volumen < 7)
				this.volumen++;
		}
	}
	
	public void volumenDown()
	{

		if(this.estado)
		{
			if(this.volumen > 0)
				this.volumen--;
		}
	}
	
	public void canalUp()
	{

		if(this.estado)
		{
			if(this.canal < 120)
				this.canal++;
		}
	}
	
	public void canalDown()
	{

		if(this.estado)
		{
			if(this.canal > 1)
				this.canal--;
		}
	}
	
	public boolean getEstado()
	{
		return this.estado;
	}
}
