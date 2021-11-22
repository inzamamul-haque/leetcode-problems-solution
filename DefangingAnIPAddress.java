public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder newAddress = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newAddress.append("[.]");
            } else {
                newAddress.append(address.charAt(i));
            }
        }
        System.out.println(newAddress.toString());
    }
}
