package me.john000708.slimexpansion;

import org.bukkit.Material;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;

/**
 * Created by John on 17.04.2016.
 */
public class CustomRecipeType {
	
    public static final RecipeType RECYCLER;
    public static final RecipeType UU_FABRICATOR;
    public static final RecipeType DEEP_MINER;
    public static final RecipeType BEDROCK_BREAKER;

    static {
        RECYCLER = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&cПереработчик", "", "&a&oСложите предметы для", "&a&oпереработки в скрап-набор"));
        DEEP_MINER = new RecipeType(new CustomItem(Material.BEACON, "&aГлубокий ядерный копатель", "", "&a&oДобывается в глубоком ядерном копателе"));
        BEDROCK_BREAKER = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&aЛоматель бедрока", "", "&a&oВырабатывается ломателем бедрока", "&a&oпри разрушении бедрока"));
        UU_FABRICATOR = new RecipeType(new CustomItem(Material.PURPLE_STAINED_GLASS, "&aМатричный производитель", "", "&a&oИзделие матричного производителя"));
    }
}
