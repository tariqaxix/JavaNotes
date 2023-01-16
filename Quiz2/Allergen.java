package Quiz2;

enum Allergen {
    EGGS(4),
    PEANUTS(8),
    SHELLFISH(9),
    STRAWBERRIES(8),
    TOMATOES(39),
    CHOCOLATE(59),
    POLLEN(54),
    CATS(310);

    private final int num;

    Allergen(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }
}