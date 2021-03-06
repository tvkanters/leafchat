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
package leafchat.startup;

/** Implemented by things that can find API classes */
public interface APIClassLocator
{
	/**
	 * @param sName Desired class name
	 * @return Class object
	 * @throws ClassNotFoundException  If class isn't found
	 */
	Class<?> findAPIClass(String sName) throws ClassNotFoundException;
}
