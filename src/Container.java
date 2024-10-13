public class Container
{
    private int[] mass;
    Container(Integer size){
        mass = new int[size];
    }
    public int get(Integer index){
        return mass[index];
    }
    public void set(Integer value, Integer index){
        mass[index] = value;
    }
    public int size(){
        return mass.length;
    }
    public void add(Integer value){
        int[] temp = new int[mass.length+1];
        System.arraycopy(mass, 0, temp, 0, mass.length);
        temp[mass.length] = value;
        mass = temp;
    }
    public void delete(Integer index){
        if(index >=0 && index < mass.length) {
            int[] temp = new int[mass.length - 1];
            int j = 0;
            for (int i = 0; i < mass.length; i++) {
                if (i != index) {
                    temp[j] = mass[i];
                    j++;
                }
            }
            mass = temp;
        }
        else System.out.println("Индекс выходит за границы");
    }
    public void print(){
        for (int el : mass) {
            System.out.println(el);
        }
        System.out.println("Размер массива: " + size());
        System.out.println();
    }
}