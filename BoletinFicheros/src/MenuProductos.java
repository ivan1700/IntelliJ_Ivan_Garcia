public enum MenuProductos {
    VIDEOJUEGOS("Videojuegos"),
    PERIFERICOS("Periféricos"),
    MERCHANDISING("Merchandising");

    private String menu;

    MenuProductos(String menu){this.menu=menu;}

    @Override
    public String toString() {
        return menu;
    }
}
