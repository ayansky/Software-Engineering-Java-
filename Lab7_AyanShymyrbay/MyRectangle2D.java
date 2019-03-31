
 class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	MyRectangle2D(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//Setters
	public void setX(double x){
		this.x = x; 
	}
	public void setY(double y){
		this.y = y;
	}
	public void setWidth(double width){
		this.width = width;
	} 
	public void setHeight(double height){
		this.height = height;
	}
	
	//Getters
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	
	//Area and Perimeter
	
	public double getArea(){
		return width*height;
	}

	public double getPerimeter(){
		return 2*(width+height);
	}

	//Contains
	
	public boolean contains(double a, double b){
		if(Math.abs(a - x) <= (width/2) && Math.abs(b-y) <= (height/2))
			return true;
		else 
			return false;
	}
	
	public boolean contains(MyRectangle2D r){
		double distanceX;
		double distanceY;
		double distanceWidth;
		double distanceHeight;
		
		distanceX = Math.abs(r.getX() - x);
		distanceY = Math.abs(r.getY() - y);
		distanceWidth = Math.abs(r.getWidth() - width)/2;
		distanceHeight = Math.abs(r.getHeight() - height)/2;
		
		if(distanceX <= distanceWidth && distanceY <= distanceHeight )
			return true;
		else 
			return false;
	}
	
	public boolean overlaps(MyRectangle2D r){
		double distanceX;
		double distanceY;
		double distanceWidth;
		double distanceHeight;
		
		distanceX = Math.abs(r.getX() - x);
		distanceY = Math.abs(r.getY() - y);
		distanceWidth = Math.abs(r.getWidth() + width)/2;
		distanceHeight = Math.abs(r.getHeight() + height)/2;
		
		if(distanceX <= distanceWidth && distanceY <= distanceHeight )
			return true;
		else 
			return false;
	}
	
}
