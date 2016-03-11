package johnhoganuke.expandedexpansion.appeng.machine;

import appeng.me.GridNode;
import mekanism.common.tile.TileEntityEnergizedSmelter.java

import appeng.api.exceptions.FailedConnection;
import appeng.api.networking.GridFlags;
import appeng.api.networking.GridNotification;
import appeng.api.networking.IGrid;
import appeng.api.networking.IGridBlock;
import appeng.api.networking.IGridCache;
import appeng.api.networking.IGridConnection;
import appeng.api.networking.IGridConnectionVisitor;
import appeng.api.networking.IGridHost;
import appeng.api.networking.IGridNode;
import appeng.api.networking.IGridVisitor;
import appeng.api.networking.energy.IEnergyGrid;
import appeng.api.networking.events.MENetworkChannelsChanged;
import appeng.api.networking.pathing.IPathingGrid;
import appeng.api.util.AEColor;
import appeng.api.util.DimensionalCoord;
import appeng.api.util.IReadOnlyCollection;
import appeng.core.worlddata.WorldData;
import appeng.hooks.TickHandler;
import appeng.me.pathfinding.IPathItem;
import appeng.util.IWorldCallable;
import appeng.util.ReadOnlyCollection;

public class MESmelter extends TileEntityEnergizedSmelter, GridStorage {
  // I really don't quite know wtf I'm doing...
}
