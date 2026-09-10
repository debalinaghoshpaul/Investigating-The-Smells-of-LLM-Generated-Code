package chapter_eight;

public abstract class Alien
{
    private int health; // 0=dead, 100=full strength
    private String name;

    abstract public int getDamage();


    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

package chapter_eight;

/**
 * 1. In Programming Project 7.3 from Chapter 7, the Alien class was rewritten to use
 * inheritance. The rewritten Alien class should be made abstract because there
 * will never be a need to create an instance of it, only its derived classes. Change this
 * to an abstract class and also make the getDamage method an abstract method. Test
 * the class from your main method to ensure that it still operates as expected
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_01
{
    public static void main(String[] args) {
        Alien ogre = new OrgeAlien(100, "O12");
        Alien snake = new SnakeAlien(100, "S33");
        Alien marshmallow = new MarshmallowManAlien(100, "M43");

        System.out.println(ogre.getDamage()); // 6
        System.out.println(snake.getDamage()); // 10
        System.out.println(marshmallow.getDamage()); // 2
    }
}

package chapter_eight;

public class MarshmallowManAlien extends Alien
{
    private static final int DAMAGE = 2;

    public MarshmallowManAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}

package chapter_eight;

public class OrgeAlien extends Alien
{
    private static final int DAMAGE = 6;

    public OrgeAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    @Override
    public int getDamage() {
        return DAMAGE;
    }


}

package chapter_eight;

public class SnakeAlien extends Alien
{
    private static final int DAMAGE = 10;

    public SnakeAlien(int health, String name)
    {
        setName(name);
        setHealth(health);
    }


    public int getDamage()
    {
        return DAMAGE;
    }
}


