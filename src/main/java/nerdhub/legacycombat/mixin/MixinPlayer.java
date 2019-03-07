package nerdhub.legacycombat.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class MixinPlayer {

    @Inject(method = "method_7261", at = @At("HEAD"), cancellable = true)

    private void attackCooldown(float float_1, CallbackInfoReturnable<Float> cir){

        cir.setReturnValue(1F);


    }
}
