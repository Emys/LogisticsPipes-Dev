package logisticspipes.buildcraft.logisticspipes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import logisticspipes.krapht.AdjacentTile;

import net.minecraft.src.TileEntity;



/**
 * This interface gives access to the surrounding world
 * @author Krapht
 *
 */
public interface IAdjacentWorldAccess {

	public LinkedList<AdjacentTile> getConnectedEntities();
	public int getRandomInt(int maxSize);
}