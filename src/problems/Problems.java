package problems;

public class Problems {

    private String name;
    private String description;
    private ProblemsType type;
    private boolean isSolved;

    public Problems(String name, ProblemsType type){
        this.name = name;
        this.description = "";
        this.type = type;
        this.isSolved = false;
}
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public ProblemsType gettype(){
        return type;
    }
    public void setSolved(boolean solved){
        this.isSolved = solved;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
