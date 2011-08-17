/*
This file is part of leafdigital leafChat.

leafChat is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

leafChat is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with leafChat. If not, see <http://www.gnu.org/licenses/>.

Copyright 2011 Samuel Marshall.
*/
package leafchat.core.api;

/** Information about an exported API package */
public interface PluginExport
{
	/**
	 * @return Exported package name
	 */
	public String getPackage();

	/**
	 * @return Compatible API version numbers
	 */
	public int[] getCompatibleVersions();

	/**
	 * @return Maximum supported version number
	 */
	public int getMaxVersion();
}