public class Reformatory {
    private int totalWeightMeasurements = 0;
    
    public int weight(Person person) 
    {
        this.totalWeightMeasurements++;
        return person.getWeight();
        
    }
    
    public int totalWeightsMeasured() 
    {
        return this.totalWeightMeasurements;
    }
    
    public void feed(Person person)
    {
        person.setWeight(person.getWeight() + 1);
    }
    
}
