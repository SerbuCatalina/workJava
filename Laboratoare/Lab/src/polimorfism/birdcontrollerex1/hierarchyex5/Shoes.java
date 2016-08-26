package polimorfism.birdcontrollerex1.hierarchyex5;

enum Brand{

}
enum Size{
    FOR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    ELEVEN
}
enum Gender{
    MALE,
    FEMALE
}
public interface IShoes {
    String name;
    Size size;
    Gender gender;



}
