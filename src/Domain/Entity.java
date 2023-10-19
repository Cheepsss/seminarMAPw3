package Domain;

public class Entity {
    protected int id;
    Entity(int id){
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getID(){
        return this.id;
    }
}
