package geoPoliticalZone;

public enum EnumGeoPoliticalZone {
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nassarawa","Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa","Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina","Kano", "Kebbi", "SOkoto", "Jigawa", "Zamfara"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-ibom", "Bayelsa", "Cross-river", "Delta", "Edo", "Rivers"});

    EnumGeoPoliticalZone(String[] strings) {
    }
}
