package eu.midnightdust.neoforge.betterbeds;

import net.minecraft.resource.ResourcePackProfile;
import net.minecraft.resource.ResourcePackSource;
import net.minecraft.resource.ResourceType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddPackFindersEvent;

import static eu.midnightdust.neoforge.betterbeds.BetterBedsNeoForge.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class BetterBedsClientEvents {
    @SubscribeEvent
    public static void addPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == ResourceType.CLIENT_RESOURCES) {
            event.addPackFinders(Identifier.of(MOD_ID, "fancyconnectedbeds"), ResourceType.CLIENT_RESOURCES, Text.of("betterbeds/fancyconnectedbeds"), ResourcePackSource.BUILTIN, false, ResourcePackProfile.InsertionPosition.TOP);
        }
    }
}
