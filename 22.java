//Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.

class Tile{
  private float length,size;
  public Tile(float length){
    this.length = length;
  }
  public void setLength(float length){
    this.length = length;
  }
  public Tile(){}
  
  public float getLength(){
    return length;
  }
  public float tileSize(){
    size = length * length;
    return size;
  }
}

class Floor{
  private float length,width;
  
  public Floor(float length,float width){
    this.length = length;
    this.width = width;
  }
  public void setLength(float length){
    this.length = length;
  }
  public void setWidth(float width){
    this.width = width;
  }
  
  public int totalTiles(Tile t){
    float size = t.tileSize();
    float floorSize = length * width;
    int tiles = (int)(floorSize / size);
    return tiles;
  }
}

class Test{
  public static void main(String args[]){
    Tile t1 = new Tile(6);
    Floor f1 = new Floor(36,24);
    int x = f1.totalTiles(t1);
    System.out.println("Total Tiles : " + x);
  }
}
