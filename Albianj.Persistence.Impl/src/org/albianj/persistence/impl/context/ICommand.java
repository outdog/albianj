package org.albianj.persistence.impl.context;

import java.util.Map;

public interface ICommand
{
	public String getCommandText();
	public void setCommandText(String commandText);
	public CommandType getCommandType();
	public void setCommandType(CommandType commandType);
	public Map<Integer,Object> getParameters();
	public void setParameters(Map<Integer,Object> parameters);
}