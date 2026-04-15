class Signal {
    private String color = "RED";

    public String getColor() {
        return color;
    }

    public void changeSignal() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }

        System.out.println("\n🚦 Signal changed to: " + color);
    }
}