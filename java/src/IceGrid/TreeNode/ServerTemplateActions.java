// **********************************************************************
//
// Copyright (c) 2003-2005 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
package IceGrid.TreeNode;

import javax.swing.tree.TreePath;

import IceGrid.Actions;
import IceGrid.ServerDescriptor;
import IceGrid.TemplateDescriptor;
import IceGrid.Model;

class ServerTemplateActions extends Actions
{
    ServerTemplateActions(Model model)
    {
	super(model);
    }
    
    void reset(ServerTemplate serverTemplate)
    {
	_serverTemplate = serverTemplate;
	_copy.setEnabled(true);
	Object clipboard = _model.getClipboard();
	if(clipboard != null && clipboard instanceof TemplateDescriptor)
	{
	    TemplateDescriptor d = (TemplateDescriptor)clipboard;
	    _paste.setEnabled(d.descriptor instanceof ServerDescriptor);
	}
	else
	{
	    _paste.setEnabled(false);
	}
	_delete.setEnabled(true);
    }

    protected void copy()
    {
	_model.setClipboard(_serverTemplate.copy());
	_paste.setEnabled(true);
    }

    protected void paste()
    {
	((ServerTemplates)_serverTemplate.getParent()).paste();
    }

    protected void delete()
    {
	TreePath parentPath = _serverTemplate.getParent().getPath();
	_serverTemplate.destroy();
	_model.setSelectionPath(parentPath);
    }

    ServerTemplate _serverTemplate; 
}
