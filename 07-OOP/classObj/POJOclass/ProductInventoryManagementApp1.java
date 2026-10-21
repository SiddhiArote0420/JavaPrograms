import java.util.*;

// Product class: Represents a single product
class Product {
    private int id, price, quantity;
    private String name, category;

    // Constructor
    public Product(int id, int price, int quantity, String name, String category) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }

    // Getters
    public int getId() { return id; }
    public int getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getName() { return name; }
    public String getCategory() { return category; }

    // Setters
    public void setPrice(int price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}

// Store class: Manages multiple products
class Store {
    int count = 0;
    private Product[] products;

    public Store(int size) {
        products = new Product[size];
    }

    // Add a product
    public void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        } else {
            System.out.println("Store is full!");
        }
    }

    // Show all products
    public void showProducts() {
        if (count == 0) {
            System.out.println("No products available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            Product p = products[i];
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() +
                               ", Category: " + p.getCategory() +
                               ", Price: " + p.getPrice() +
                               ", Quantity: " + p.getQuantity());
        }
    }

    // Search by ID
    public Product searchById(int id) {
        for (int i = 0; i < count; i++)
            if (products[i].getId() == id) return products[i];
        return null;
    }

    // Search by Name
    public Product searchByName(String name) {
        for (int i = 0; i < count; i++)
            if (products[i].getName().equalsIgnoreCase(name)) return products[i];
        return null;
    }

    // Delete by category
    public void deleteByCategory(String category) {
        for (int i = 0; i < count; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                for (int j = i; j < count - 1; j++) products[j] = products[j + 1];
                products[count - 1] = null;
                count--;
                i--;
            }
        }
    }

    // Delete products with price < 100
    public void deleteByPriceLessThan100() {
        for (int i = 0; i < count; i++) {
            if (products[i].getPrice() < 100) {
                for (int j = i; j < count - 1; j++) products[j] = products[j + 1];
                products[count - 1] = null;
                count--;
                i--;
            }
        }
    }

    // Update quantity by ID
    public void updateQuantityById(int id, int newQuantity) {
        Product p = searchById(id);
        if (p != null) p.setQuantity(newQuantity);
        else System.out.println("Product not found!");
    }

    // Update price by Name
    public void updatePriceByName(String name, int newPrice) {
        Product p = searchByName(name);
        if (p != null) p.setPrice(newPrice);
        else System.out.println("Product not found!");
    }

    // Sort by ID ascending
    public void sortById() {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - i - 1; j++)
                if (products[j].getId() > products[j + 1].getId()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
    }

    // Sort by Price descending
    public void sortByPriceDesc() {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - i - 1; j++)
                if (products[j].getPrice() < products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
    }

    // Most expensive product
    public void mostExpensiveProduct() {
        if (count == 0) { System.out.println("No products available."); return; }
        Product max = products[0];
        for (int i = 1; i < count; i++)
            if (products[i].getPrice() > max.getPrice()) max = products[i];
        System.out.println("Most expensive product: " + max.getName() + ", Price: " + max.getPrice());
    }

    // Products in price range 1000-5000
    public void priceRange1000to5000() {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            int price = products[i].getPrice();
            if (price >= 1000 && price <= 5000) {
                System.out.println(products[i].getName() + ", Price: " + price);
                found = true;
            }
        }
        if (!found) System.out.println("No products in this price range.");
    }
}

// Main class: Menu-driven program
public class ProductInventoryManagementApp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Store store = new Store(50); // max 50 products

        while (true) {
            System.out.println("\n--- Product Inventory Menu ---");
            System.out.println("1: Add Product");
            System.out.println("2: Show All Products");
            System.out.println("3: Search by ID");
            System.out.println("4: Search by Name");
            System.out.println("5: Delete by Category");
            System.out.println("6: Delete Products Price < 100");
            System.out.println("7: Update Quantity by ID");
            System.out.println("8: Update Price by Name");
            System.out.println("9: Sort by ID Ascending");
            System.out.println("10: Sort by Price Descending");
            System.out.println("11: Most Expensive Product");
            System.out.println("12: Products in Price 1000-5000");
            System.out.println("13: Exit");

            System.out.print("Enter choice: ");
            int choice = in.nextInt();
            in.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter Name: ");
                    String name = in.nextLine();
                    System.out.print("Enter Category: ");
                    String category = in.nextLine();
                    System.out.print("Enter Price: ");
                    int price = in.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = in.nextInt();
                    Product p = new Product(id, price, quantity, name, category);
                    store.addProduct(p);
                    break;
                case 2:
                    store.showProducts();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = in.nextInt();
                    Product foundById = store.searchById(searchId);
                    if (foundById != null) System.out.println("Found: " + foundById.getName());
                    else System.out.println("Product not found");
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    String searchName = in.nextLine();
                    Product foundByName = store.searchByName(searchName);
                    if (foundByName != null) System.out.println("Found: " + foundByName.getName());
                    else System.out.println("Product not found");
                    break;
                case 5:
                    System.out.print("Enter Category to delete: ");
                    String delCat = in.nextLine();
                    store.deleteByCategory(delCat);
                    break;
                case 6:
                    store.deleteByPriceLessThan100();
                    break;
                case 7:
                    System.out.print("Enter ID to update quantity: ");
                    int upId = in.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQty = in.nextInt();
                    store.updateQuantityById(upId, newQty);
                    break;
                case 8:
                    System.out.print("Enter Name to update price: ");
                    String upName = in.nextLine();
                    System.out.print("Enter new price: ");
                    int newPrice = in.nextInt();
                    store.updatePriceByName(upName, newPrice);
                    break;
                case 9:
                    store.sortById();
                    System.out.println("Products sorted by ID ascending.");
                    break;
                case 10:
                    store.sortByPriceDesc();
                    System.out.println("Products sorted by Price descending.");
                    break;
                case 11:
                    store.mostExpensiveProduct();
                    break;
                case 12:
                    store.priceRange1000to5000();
                    break;
                case 13:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
