import { WebPlugin } from '@capacitor/core';

import type { PreviewMemoryPlugin } from './definitions';

export class PreviewMemoryWeb extends WebPlugin implements PreviewMemoryPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
