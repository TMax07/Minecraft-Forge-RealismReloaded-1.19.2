package net.tmax07.realismreloaded.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tmax07.realismreloaded.RealismReloaded;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealismReloaded.MOD_ID);

    public static final RegistryObject<Item> ITEMNAME = ITEMS.register("itemname", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}