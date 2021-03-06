package com.jae.spacedout.game.events;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.utils.Pool.Poolable;
import com.jae.spacedout.game.components.Mappers;
import com.jae.spacedout.game.components.WeaponComponent;

public class ShootEvent implements Event, Poolable
{
    //default constructor
    public ShootEvent()
    {

    }

    @Override
    public void execute(Entity entity)
    {
        WeaponComponent weapon = Mappers.weapon.get(entity);
        //add to bullets waiting to be fired
        /*weapon.shouldShoot[this.whichWeapon] = true;*/
        for(int i = 0; i < weapon.shouldShoot.length; i++)
        {
            weapon.shouldShoot[i] = true;
        }
    }

    @Override
    public void reset()
    {

    }
}
