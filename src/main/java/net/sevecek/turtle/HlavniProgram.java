package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();



        /* část 1+2

        prase(zofka);

        //přesun na jinou pozici
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(45);
        zofka.move(300);

        osmiuhelnik(zofka);

        //přesun vedle osmiuhelniku
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);

        kolecko(zofka);
        slunce(zofka);

        //přesun někam doprava
        zofka.penUp();
        zofka.move(300);

  */

      //část 3

     //přesun doleva nahoru
     zofka.penUp();
     zofka.move(330);
     zofka.turnLeft(90);
     zofka.move(530);

     maleSlunce(zofka);

     // přesun o řádek níž
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(30);

     // 5 x malý domek

      for (int pr = 0; pr < 5; pr++) {
          malyDomek(zofka);
      }

      // přesun o řádek níž
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(180);
        zofka.turnRight(90);
        zofka.move(700);


        malyDomek(zofka);

      // přesun vedle

        zofka.turnRight(90);
        zofka.penDown();
        prase(zofka);

      //přesun na další pozici

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(45);
        zofka.move(250);
        zofka.turnLeft(180);


        malyDomek(zofka);


        // přesun o řádek níž
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.penDown();

        pismenoP(zofka);
        pismenoA(zofka);
        pismenoV(zofka);
        pismenoE(zofka);
        pismenoL(zofka);







    }

    private void malyDomek(Turtle zofka) {
        for (int d = 0; d < 4; d++) {
            zofka.penDown();
            zofka.move(80);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(80);
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(56.57);
        zofka.turnLeft(90);
        zofka.move(56.57);
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(220);
        zofka.turnLeft(180);

    }

    private void maleSlunce(Turtle zofka) {
        zofka.penDown();

        for (int i1 = 0; i1 < 12; i1++) {

            for (int i2 = 0; i2 < 6; i2++) {
                zofka.move(2.5);
                zofka.turnLeft(5);
            }
            zofka.turnRight(90);
            zofka.move(10);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(10);
            zofka.turnRight(90);
            zofka.penDown();
        }
    }

    private void slunce(Turtle zofka) {
        zofka.penDown();

        for (int i1 = 0; i1 < 12; i1++) {

            for (int i2 = 0; i2 < 6; i2++) {
                zofka.move(5.5);
                zofka.turnLeft(5);
            }
            zofka.turnRight(90);
            zofka.move(25);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnRight(90);
            zofka.penDown();
        }
    }

    private void kolecko(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 72; i++) {
            zofka.move(5.5);
            zofka.turnLeft(5);
        }
        zofka.penUp();
        zofka.move(250);
    }

    private void osmiuhelnik(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);

        }
    }

    private void pismenoL(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(140);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(140);

        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50);

        zofka.penUp();
        zofka.move(150);
    }

    private void pismenoE(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnRight(90);
        zofka.move(50);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);

        zofka.turnLeft(90);
        zofka.move(70);

        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);

        zofka.turnLeft(90);
        zofka.move(70);

        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50);

        zofka.penUp();
        zofka.move(30);
    }

    private void pismenoV(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(75);
        zofka.move(140);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(140);

        zofka.penDown();
        zofka.turnRight(150);
        zofka.move(140);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(140);

        zofka.turnLeft(75);
        zofka.move(70);
    }

    private void pismenoA(Turtle zofka) {
        zofka.penDown();
        zofka.turnLeft(75);
        zofka.move(140);
        zofka.turnRight(150);
        zofka.move(140);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(75);

        zofka.penDown();
        zofka.move(40);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(75);
        zofka.move(50);

        zofka.turnLeft(75);
        zofka.move(50);
    }

    private void pismenoP(Turtle zofka) {
        zofka.move(120);
        zofka.turnRight(45);
        zofka.penDown();
        for (int i = 0; i < 53; i++) {
            zofka.move(3);
            zofka.turnRight(5);

        }
        zofka.penUp();
        zofka.turnLeft(130);
        zofka.move(76);
        zofka.turnLeft(90);
        zofka.move(80);
    }

    private void prase(Turtle zofka) {
        //tělo prasete
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(160);
            zofka.turnRight(90);
        }
        //hlava prasete
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        //návrat k levé přední části těla
        zofka.penUp();

        zofka.turnRight(135);
        zofka.move(100);

        //nohy prasete
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move( 30);
        zofka.penUp();

        zofka.turnRight(180);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(30);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);

        zofka.turnRight(45);
        zofka.move(160);

        zofka.penDown();
        zofka.turnRight(45);
        zofka.move( 30);
        zofka.penUp();

        zofka.turnRight(180);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(30);
    }

}
