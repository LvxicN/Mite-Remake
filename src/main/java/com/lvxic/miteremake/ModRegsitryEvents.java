package com.lvxic.miteremake;

import com.lvxic.miteremake.init.BlockList;
import com.lvxic.miteremake.init.ItemList;
import com.lvxic.miteremake.init.GroupMineing;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegsitryEvents {
    
    public static final ItemGroup mineing = new GroupMineing();

    // Registering Items
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
            // >> Items go here 
            // Foods :
            ItemList.banana = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("banana")),
            ItemList.blueberries = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("blueberries")),
            ItemList.cheese = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("cheese")),
            ItemList.chocolate = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("chocolate")),
            ItemList.dough = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("dough")),
            ItemList.flour = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("flour")),
            ItemList.lemon = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("lemon")),
            ItemList.orange = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("orange")),
            ItemList.worm_cooked = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("worm_cooked")),
            ItemList.worm_raw = new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(Location("worm_raw")),
            // Shards :
            ItemList.diamond_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("diamond_shard")),
            ItemList.emerald_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("emerald_shard")),
            ItemList.flint_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("flint_shard")),
            ItemList.glass_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("glass_shard")),
            ItemList.obsidian_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("obsidian_shard")),
            ItemList.quartz_shard = new Item(new Item.Properties().group(mineing)).setRegistryName(Location("quartz_shard")),
            // Ingots:
            
            
            // >>BlockItems go here
            // Crops :
            ItemList.onion = new BlockItem(BlockList.onion, new Item.Properties().group(ItemGroup.FOOD)).setRegistryName(BlockList.onion.getRegistryName())
        );
    }

    // Registering Blocks
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            // Crops :
            BlockList.onion = new Block(Block.Properties.create(Material.PLANTS).sound(SoundType.CROP).tickRandomly()).setRegistryName(Location("onion")),
            // Ores:
            BlockList.adamantium_ore = new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f, 5.0f))
        );
    }   

    private static ResourceLocation Location(String name){
        // Being Lazy
        return new ResourceLocation(MiteRemake.MODID, name);
    }
}
