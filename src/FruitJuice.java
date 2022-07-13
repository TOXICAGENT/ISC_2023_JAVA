import java.util.Scanner;
public class FruitJuice
{
    int product_code;
    String flavour, pack_type;
    int pack_size, product_price;
    
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the product code");
        product_code= ob.nextInt();
        System.out.println("Enter the flavour");
        flavour = ob.next();
        System.out.println("Ener the pack type");
        pack_type = ob.next();
        System.out.println("Enter the pack size");
        pack_size = ob.nextInt();
        System.out.println("Enter the product price");
        product_price = ob.nextInt();
    }
    
    void discount() {product_price-=10; }
    
    void display()
    {
        System.out.println("Product code: "+product_code);
        System.out.println("Flavour: "+flavour);
        System.out.println("Pack type: "+pack_type);
        System.out.println("Pack size: "+pack_size);
        System.out.println("Initial price: "+product_price+10);
        System.out.println("Final price: "+product_price);
    }
    
    public static void main(String args[])
    {
        FruitJuice glass = new FruitJuice(); glass.input(); glass.discount(); glass.display();
    }
}
