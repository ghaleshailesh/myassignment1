public class InheritanceStore {
    public static void main(String[] args) {
        Supermarket.Fruit();
        ConvienienceStore.DriedFruit();


    }
}


class Store {
    //has a register
    //has a employee
void sell ()
{
    //
    System.out.println("Store is selling...");
}
}



class Supermarket extends Store{ //isA
    void FreshFood() {
    }
}

class ConvienienceStore extends Store{
    void PackagedFood (){
    }
}

class drink
{
    void CanCoke(){
        System.out.println("Can Coke is available");
    }
    void JumboCoke(){
        System.out.println("Jumbo Coke is available");
    }
}

class fruit
{
    void DriedFruit (){
        System.out.println("Dried fruit is available");
    }
    void FreshFruit (){
        System.out.println ( "Fresh fruit is available");
    }
}