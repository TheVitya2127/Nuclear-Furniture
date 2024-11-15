package com.osmokitty.nuclearfurniture.blocks.generic;

import com.hbm.blocks.BlockMulti;
import com.osmokitty.nuclearfurniture.NuclearFurniture;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDecoStool extends BlockMulti {
    protected String[] variants = new String[] {"stool_iron", "stool_steel", "stool_plutonium"};
    @SideOnly(Side.CLIENT) protected IIcon[] icons;

    public BlockDecoStool(Material mat) {
        super(mat);
    }

    public static int renderID = RenderingRegistry.getNextAvailableRenderId();

    @Override
    public int getRenderType(){
        return renderID;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        super.registerBlockIcons(reg);
        this.icons = new IIcon[variants.length];

        for(int i = 0; i < variants.length; i++) {
            this.icons[i] = reg.registerIcon(NuclearFurniture.MODID + ":" + variants[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.icons[damageDropped(meta)];
    }

    @Override
    public int damageDropped(int meta) {
        return (Math.abs(meta) % 12) / 4;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int i = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        int meta = stack.getItemDamage();
        world.setBlockMetadataWithNotify(x, y, z, meta * 4 + i, 2);
    }

    @Override
    public int getSubCount() {
        return variants.length;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
        this.setBlockBounds(0.125F, 0F, 0.125F, 0.875F, 1F, 0.875F);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
    }
}