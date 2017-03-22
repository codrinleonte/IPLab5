// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/22/2017 3:07:09 PM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Proiectil.java


public abstract class Proiectil extends Items
{

    public Proiectil()
    {
    }

    public double getSpeed()
    {
        return speed;
    }

    public double getDrop()
    {
        return drop;
    }

    public int getdamage()
    {
        return damage;
    }

    public int getRadius()
    {
        return radius;
    }

    private int damage;
    private int radius;
    private double drop;
    private double speed;
}
