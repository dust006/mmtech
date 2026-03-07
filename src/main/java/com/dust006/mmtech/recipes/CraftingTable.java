package com.dust006.mmtech.recipes;

import com.dust006.mmtech.item.ItemRegister;
import com.dust006.mmtech.block.BlockRegister;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

@SuppressWarnings("null")
public class CraftingTable extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public CraftingTable(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    protected void buildRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegister.BRICKS_COKE.get())
            .pattern("XX")
            .pattern("XX")
            .define('X', ItemRegister.BRICK_COKE_CLAY.get())
            .unlockedBy("has_anything", has(Items.AIR))
            .save(output);
    }
}