package com.lvxic.miteremake.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


// A Item Group : Mineing
public class GroupMineing extends ItemGroup {
public GroupMineing() {
    super("mineing");
    }
    
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.flint_shard);
    }
}
