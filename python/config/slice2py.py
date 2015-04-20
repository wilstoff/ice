#!/usr/bin/env python
# **********************************************************************
#
# Copyright (c) 2003-2014 ZeroC, Inc. All rights reserved.
#
# This copy of Ice is licensed to you under the terms described in the
# ICE_LICENSE file included in this distribution.
#
# **********************************************************************

import sys, os
sys.path.append(os.path.join(os.path.dirname(sys.argv[0]), "..", "python"))
import IcePy


def main():
    val = IcePy.compile(sys.argv)
    sys.exit(int(val))

if __name__ == '__main__':
        main()
