package com.stormister.rediscovered;

import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAILookAtTradePigman extends EntityAIWatchClosest
{
    private final EntityPigman theMerchant;

    public EntityAILookAtTradePigman(EntityPigman par1EntityVillager)
    {
        super(par1EntityVillager, EntityPlayer.class, 8.0F);
        this.theMerchant = par1EntityVillager;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.theMerchant.isTrading())
        {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}