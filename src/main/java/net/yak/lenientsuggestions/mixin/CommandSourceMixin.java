package net.yak.lenientsuggestions.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.command.CommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CommandSource.class)
public interface CommandSourceMixin {

    @WrapOperation(method = "forEachMatching(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Consumer;)V", at = @At(value = "INVOKE", target = "Ljava/lang/String;equals(Ljava/lang/Object;)Z"))
    private static boolean lenientSuggestions$lenientNamespaces(String instance, Object object, Operation<Boolean> original) {
        if (object instanceof String namespace) {
            if (namespace.equals("minecraft")) { // hardcoded to that check for minecraft's namespace
                return true; // returns true for all namespaces
            }
        }
        return original.call(instance, object);
    }

}
