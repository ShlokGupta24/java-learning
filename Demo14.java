//Record classes, very imp, its a class that requires getters, setters, constructor, equals, hashcode, to String in a single line.
//Without record class we have to write this but with record class its convert in only one line.
// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("Alien{");
//         sb.append("id=").append(id);
//         sb.append(", name=").append(name);
//         sb.append('}');
//         return sb.toString();
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
    

// }

record Alien(int id,String name){}
//By using this one line of record class its done al l of the work of above code. That's why record class is imp.

public class Demo14 {
    public static void main(String[] args) {
        Alien a1=new Alien(1, "Shlok");
        Alien a2=new Alien(1, "Shlok");
        System.out.println(a1.equals(a2));
    }
}
