#-*- coding:UTF-8 -*-

import os

symbol = '- '

#递归遍历指定目录，返回目录下的所有文件名
def eachFile(filepath, flag = ''):
    childFiles = os.listdir(filepath)    
    strList = flag + filepath.split(os.path.sep)[-2] + os.linesep
    flag = flag + symbol
    for childFile in childFiles:
        child = os.path.join('%s%s' % (filepath, childFile))
        if os.path.isdir(child):
            strList = strList + eachFile(child + os.path.sep, flag)
        else:
            strList = strList + flag + childFile + os.linesep
    return strList
        
if __name__=='__main__':
    parentPath = 'F:' + os.path.sep
    filepath= parentPath + 'software' + os.path.sep
    print(parentPath + eachFile(filepath))

