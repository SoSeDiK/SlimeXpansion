package me.john000708.slimexpansion;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.utils.MachineTier;
import me.mrCookieSlime.Slimefun.utils.MachineType;


/**
 * Created by John on 14.04.2016.
 */

public class Items {
    //Items
    public static ItemStack UU_MATTER;
    public static ItemStack BEDROCK_DUST = new CustomItem(new ItemStack(Material.GUNPOWDER, 1), "&8Бедроковая пыль");
    public static ItemStack LINKER = new CustomItem(new ItemStack(Material.CLOCK), "&6Соединитель", "", "&fПрибор, соединяющий передатчик", "&fэлектричества/редстоуна и приёмник", "");
    public static ItemStack MAG_THOR = new CustomItem(new ItemStack(Material.IRON_INGOT), "&b&lМагниево-ториевый сплав", "", "&7&o\"Чрезвычайно прочный сплав, используемый", "&7&oтолько в самых продвинутых машинах\"");

    //Machines
    public static ItemStack REDSTONE_RECEIVER = new CustomItem(new ItemStack(Material.HEAVY_WEIGHTED_PRESSURE_PLATE), "&6Приёмник редстоуна", "", "&fИмитирует сигнал редстоуна при", "&fполучении сигнала от &cпередатчика");
    public static ItemStack REDSTONE_TRANSMITTER = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&cПередатчик редстоуна", "", "&fПередаёт сигнал редстоуна", "&fна все подключённые &6приёмники");
    public static ItemStack REDSTONE_CLOCK = new CustomItem(new ItemStack(Material.LIGHT_WEIGHTED_PRESSURE_PLATE), "&cРедстоуновые часы", "", "&fПередают сильный сигнал редстоуна", "&fкаждые несколько секунд, пока", "&fони настроены на выполнение");
    public static ItemStack UU_FABRICATOR = new CustomItem(Material.PURPLE_STAINED_GLASS, "&5Матричный производитель", "", "&fСоздаёт &dуниверсальную используемую", "&dматерию &fиз чистой энергии", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &74098 Дж", "&8\u21E8 &e\u26A1 &71024 Дж/с");
    public static ItemStack UU_TRANSMUTATOR = new CustomItem(Material.PINK_STAINED_GLASS, "&cУниверсальный используемый трансмутатор", "", "&fСодаёт предметы из &dуниверсальной", "&dиспользуемой материи", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &74098 Дж", "&8\u21E8 &e\u26A1 &71024 Дж/с");
    public static ItemStack RECYCLER = new CustomItem(Material.IRON_BLOCK, "&6Переработчик", "", "&fПерерабатывает материалы в &6Скрап-наборы", "&f&o(скрап-набор может быть открыт", "&f&oпозже нажатием ПКМ)", "", MachineTier.AVERAGE.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &7512 Дж", "&8\u21E8 &e\u26A1 &732 Дж/с");
    public static ItemStack WIRELESS_CHARGER = new CustomItem(Material.CYAN_TERRACOTTA, "&bБеспроводная зарядка", "", "&fЗаряжает Ваши предметы в радиусе 4x4x4", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7100 Дж/с", "&8\u21E8 &7Потери электричества: &c98%");
    public static ItemStack RAIN_MAKER = new CustomItem(Material.BLUE_TERRACOTTA, "&3Погодный контроллер", "", "&fМашина, способная изменять погоду", "", "§fИодный/диссипативный заряд – дождь/солнце", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7512 Дж/с");
    public static ItemStack BEDROCK_BREAKER = new CustomItem(Material.IRON_BLOCK, "&4Ломатель бедрока", "", "&fНастолько мощная машина, что может", "&fпревратить &8бедрок &fв пыль", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &74096 Дж/с", "&8\u21e8 &7Требует &cголовку бура &7для работы");
    public static ItemStack DEEP_DEPTH_MINER = new CustomItem(new ItemStack(Material.DIAMOND_BLOCK), "&4Глубокий ядерный копатель", "", "&fИзвлекает руды прямо из &8бедрока&f", "", "&fМожет добывать редкий радиоактивный &2торий", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &71024 Дж/с", "&8\u21E8 &7Требует &cлазерный заряд &fдля работы");
    public static ItemStack CHUNK_LOADER = new CustomItem(Material.ENCHANTING_TABLE, "&5Загрузчик чанков", "", "&fСпециальная машина, способная", "&fиспользовать мощность &2тория&f, чтобы", "&fподдерживать чанк загруженным");
    public static ItemStack ENERGY_TRANSMITTER = new CustomItem(Material.RED_TERRACOTTA, "&cПередатчик электричества", "", "&fПередаёт электричество", "&fна все подключённые &aприёмники", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость передачи: 200 Дж/с", "&8\u21E8 &c75% эффективности");
    public static ItemStack ENERGY_RECEIVER = new CustomItem(Material.LIME_TERRACOTTA, "&aПриёмник электричества", "", "&fПолучает электричество от &cпередатчика", "", MachineTier.END_GAME.and(MachineType.MACHINE));
    public static ItemStack TERRAFORMER = new CustomItem(Material.GREEN_TERRACOTTA, "&2Терраформер", "", "&fМожет изменить биом в чанке", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Использует терраформические модули");

    //Weapons
    public static ItemStack NANO_BLADE = new CustomItem(new ItemStack(Material.DIAMOND_SWORD), "&2Электрический клинок", "", "&fПередовая технология, способная легко", "&fразрезать органические ткани", "&7&o(увеличивает урон в 2.5 раза)", "", "&fАктивация: &aShift + ПКМ", "", "&8\u21E8 &7Потребляет &e2.5 Дж &7за удар", "", "&c&o&8\u21E8 &e\u26A1 &70 / 500 Дж");

    //Armor
    public static ItemStack ELECTRIC_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&9Электрический нагрудник", "", "&8\u21E8 &7Поглощает весь нанесённый урон", "", "&8\u21E8 &7Затраты: &eурон / 1.75 Дж", "&c&o&8\u21E8 &e\u26A1 &70 / 250 Дж"), Color.TEAL);

    //Custom Items
    public static ItemStack SCRAP_BOX;
    public static ItemStack EMPTY_CAPSULE;
    public static ItemStack IODINE_CHARGE;
    public static ItemStack DISSIPATION_CHARGE;
    public static ItemStack BEDROCK_DRILL;
    public static ItemStack LASER_CHARGE;
    public static ItemStack THORIUM;
    public static ItemStack FOOD_SYNTHESIZER;

    static {
        try {
            SCRAP_BOX = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM0ZGEwY2Y3ZWI3NzZkZGYyOWIzZTNkN2ZiZDFlMzI3Mzg4ODUyMjliMWEzNDc2NmU2NjgyM2MzNDcwNTU1MiJ9fX0="), "&6Скрап-набор");
            IODINE_CHARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2UzOTViZGFmNjMyZGNhZTM5NTFkYWMxZWQ0NzNjMjU0MWNhMjdmYjFjMzYxODNhOGRhYmY3ZmNhNThlOWUwIn19fQ=="), "&4Иодный заряд");
            DISSIPATION_CHARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGE1MGRmZDA5YWVmNDk0MDZmM2Q5NTNlNDE4ZGM5NDg0MWY5ZDA0NjVhZWM4ZDdjODU4MDY5ZmMzMWI0Mzg1In19fQ=="), "&6Диссипативный заряд");
            EMPTY_CAPSULE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFmMmZjOWI1M2EzMWViMWQ1NzRlMTc1OTQzOGFkOTcyZjE1MzNmYjQ1N2YxZGUzMmJiYWVhMWU3YzcwIn19fQ=="), "&3Пустая капсула");
            UU_MATTER = new CustomItem(Material.PINK_DYE, "&dУниверсальная используемая материя", "", "&7&o\"Создана из чистой энергии!\"");
            BEDROCK_DRILL = new CustomItem(CustomSkull.getItem("eyJ0aW1lc3RhbXAiOjE0NjMzNDA3NTkyNDksInByb2ZpbGVJZCI6ImQ2MmI1MjJkMTVjZjQyNWE4NTFlNmNjNDRkOGJlMDg5IiwicHJvZmlsZU5hbWUiOiJKb2huMDAwNzA4IiwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ5MjFmODhiMzViZjFlNTMxZWE0ZDUzYmU4M2ExYmE1ZGNhODgzNzQzZDE2ZDliMWVmYzY5NDQ2YjYyODk0ZDQifX19"), "&cГоловка бура", "&fДля особого бура, используемого", "&4ломателем бедрока &fдля", "&fпревращения &8бедрока&f в пыль", "", "&8\u21E8 &7Прочность: 1024/1024");
            LASER_CHARGE = new CustomItem(CustomSkull.getItem("eyJ0aW1lc3RhbXAiOjE0NjM1ODgyNjYwMTgsInByb2ZpbGVJZCI6ImQ2MmI1MjJkMTVjZjQyNWE4NTFlNmNjNDRkOGJlMDg5IiwicHJvZmlsZU5hbWUiOiJKb2huMDAwNzA4IiwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI3OWY1N2M2OGI3YTkwZTBkODg1MGU3OTRhZGU1YjhlODEwZDMzOGUyNDU5ZWVlZjliYWJkNjgzMmNhMTY5YSJ9fX0="), "&cЛазерный заряд", "&fИспользуется в &4глубоком ядерном", "&4копателе &fдля добычи руд", "", "&8\u21E8 &7Прочность: 1024/1024");
            THORIUM = new CustomItem(CustomSkull.getItem("eyJ0aW1lc3RhbXAiOjE0NjM1OTgzMTg2NDgsInByb2ZpbGVJZCI6ImQ2MmI1MjJkMTVjZjQyNWE4NTFlNmNjNDRkOGJlMDg5IiwicHJvZmlsZU5hbWUiOiJKb2huMDAwNzA4IiwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQyN2QxYTYxODRjNjJkNGM0YTY3Zjg2MmI4ZTE5ZWMwMDFhYmU0YzdkODg5ZjIzMzQ5ZThkYWZlNmQwMzMifX19"), "&8Торий", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oТребуется костюм химзащиты");
            FOOD_SYNTHESIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTExYTJkZjdkMzdhZjQwZWQ1Y2U0NDJmZDJkNzhjZDhlYmNkY2RjMDI5ZDJhZTY5MWEyYjY0Mzk1Y2RmIn19fQ=="), "&dСинтезатор пищи", "", "&fДержит Вас в сытости при", "&fпомощи искусственной пищи", "", "&8\u21E8 &e\u26A1 &70 / 100 Дж");
            
            SlimefunItem.setRadioactive(THORIUM);
            
            ItemMeta nanoBladeMeta = NANO_BLADE.getItemMeta();
            nanoBladeMeta.setUnbreakable(true);
            NANO_BLADE.setItemMeta(nanoBladeMeta);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


